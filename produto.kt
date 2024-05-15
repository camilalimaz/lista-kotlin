class Produto(var nome: String, var preco: Double, var quantidade: int){
  fun mostrar(): String {
    return "o produto é: $nome e o preço é: R$$preco: e sua quantidade é: $quantidade" }
}
fun main () {
  val produto = produto("iphone 11", 3.500, 18)
  println(produto.mostrar())
}
