package br.com.androidev

fun main() {
    val conservacao = ConservacaoMarinha("Coral", 100.0, true)
    //conservacao.exibirDados()

    // Tentativa de definir um valor inválido com try-catch
    //conservacao.areaProtegida = -50.0  // Isso vai causar uma exceção que será capturada
    conservacao.areaProtegida = 100.0
    conservacao.exibirDados()
}