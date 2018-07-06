package extra

case class IBeforeE() {
  def checkIe(s: String): Boolean = {
    var cutStr = s
    val index = Math.max(s.lastIndexOf("ie"), s.lastIndexOf("ei"))
    if ( index > 0) cutStr = cutStr.substring(0, index)

    val ieWords = cutStr.split("ie")
    val eiWords = cutStr.split("ei")

    if (s.contains("ei") && s.contains("ie")) !ieWords.exists(w => w.nonEmpty && w(w.length - 1).toLower == 'c') &&
      !eiWords.exists(w => w.nonEmpty && w(w.length - 1).toLower != 'c')
    else if (s.contains("ie")) ieWords.nonEmpty && !ieWords.exists(w => w.nonEmpty && w(w.length - 1).toLower == 'c')
    else if (s.contains("ei")) eiWords.nonEmpty && !eiWords.exists(w => w.nonEmpty && w(w.length - 1).toLower != 'c')
    else true
  }
}
