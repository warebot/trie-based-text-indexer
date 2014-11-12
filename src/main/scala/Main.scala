/**
 * Created by minnaguib on 11/12/14.
 */

case class Node(value: Char, var children: Option[List[Node]])

class Trie (_root:Node = Node(0, None)){

  def root:Node = this._root

  def findNode(node: Node, letter: Char): Option[Node] = {
    node.children map (_.find(n => n.value == letter)) getOrElse (None)
  }

  def wordExists(word: String, node: Node): (String, Option[Node]) = {
    if (word == "")
      (word, Some(node))
    else
      findNode(node, prefix(word).get) map (wordExists(word.drop(1), _)) getOrElse ((word, Some(node)))
  }

  def prefix(word: String): Option[Char] = if (word.length > 0) Some(word.head) else None

  def addNode(parentNode: Node, node: Node) =
    parentNode.children = Some(parentNode.children map (node :: _) getOrElse (List(node)))

  def addSuffix(suffix: String, node: Node): Unit = {
    if (suffix.length > 0) {
      val child = Node(prefix(suffix).get, None)
      addNode(node, child)
      addSuffix(suffix.drop(1), child)
    }
  }

  def add(word: String) = {
    wordExists(word, this.root) match {
      case (w: String, Some(n: Node)) if w.length > 0 => addSuffix(w, n);
        println(word, "was successfully indexed")
      case _ => println(word, "was previously indexed")
    }
  }
}

