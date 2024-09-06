package br.com.androidev

import br.com.androidev.DesafioIniciante.ConservacaoMarinha
import br.com.androidev.DesafioIntermediario.AreaProtegidaMarinha
import br.com.androidev.DesafioIntermediario.ReservaMarinha
import br.com.androidev.DesafioIntermediario.TipoAmbiente

fun main() {
   val conservacao = ConservacaoMarinha("Coral", 100.0, true)
    //conservacao.exibirDados()

    // Tentativa de definir um valor inválido com try-catch
    //conservacao.areaProtegida = -50.0  // Isso vai causar uma exceção que será capturada
    conservacao.areaProtegida = 100.0
    conservacao.exibirDados()

/*
  Desafio intermediário
  // Instância de ReservaMarinha
    val conservacao1 = ReservaMarinha(TipoAmbiente.ESTUARIO, 120.5, true, "Reserva Biológica")

    // Usando o comando 'with' para mostrar informações
    with(conservacao1) {
        mostrarInformacoes()
    }

    println("----")

    // Instância de AreaProtegidaMarinha
    val conservacao2 = AreaProtegidaMarinha(TipoAmbiente.RECIFE_CORAL, 200.0, false, "Proteção Integral")

    // Usando o comando 'with' para mostrar informações
    with(conservacao2) {
        mostrarInformacoes()
    }*/
}