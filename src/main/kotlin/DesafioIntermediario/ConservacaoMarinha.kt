package br.com.androidev.DesafioIntermediario

open class ConservacaoMarinha(
    val tipoAmbiente: TipoAmbiente,
    val areaProtegidaEmKm2: Double,
    val possuiProgramaMonitoramento: Boolean
) {
    open fun mostrarInformacoes() {
        println("Tipo de Ambiente: $tipoAmbiente")
        println("Área Protegida: $areaProtegidaEmKm2 km²")
        println("Possui Programa de Monitoramento: $possuiProgramaMonitoramento")
    }
}
