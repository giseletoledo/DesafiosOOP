package br.com.androidev.DesafioIntermediario

class ReservaMarinha(
    tipoAmbiente: TipoAmbiente,
    areaProtegidaEmKm2: Double,
    possuiProgramaMonitoramento: Boolean,
    val tipoReserva: String
) : ConservacaoMarinha(tipoAmbiente, areaProtegidaEmKm2, possuiProgramaMonitoramento) {

    override fun mostrarInformacoes() {
        super.mostrarInformacoes()
        println("Tipo de Reserva: $tipoReserva")
    }
}
