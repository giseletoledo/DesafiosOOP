package br.com.androidev.DesafioIntermediario

class AreaProtegidaMarinha(
    tipoAmbiente: TipoAmbiente,
    areaProtegidaEmKm2: Double,
    possuiProgramaMonitoramento: Boolean,
    val tipoProtecao: String
) : ConservacaoMarinha(tipoAmbiente, areaProtegidaEmKm2, possuiProgramaMonitoramento) {

    override fun mostrarInformacoes() {
        super.mostrarInformacoes()
        println("Tipo de Proteção: $tipoProtecao")
    }
}

