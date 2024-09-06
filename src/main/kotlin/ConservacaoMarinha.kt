package br.com.androidev

class ConservacaoMarinha(var tipoAmbiente: String, var areaProtegidaEmKm2: Double, var possuiProgramaMonitoramento: Boolean) {

    init {
        println("Iniciando Conservação Marinha com os valores: $tipoAmbiente, $areaProtegidaEmKm2, $possuiProgramaMonitoramento")
    }

    // Getter e Setter personalizados com try-catch
    var areaProtegida: Double = areaProtegidaEmKm2
        get() = field
        set(value) {
            try {
                when {
                    value < 0 -> {
                        throw IllegalArgumentException("Área protegida não pode ser negativa.")
                    }
                    else -> field = value
                }
            } catch (e: IllegalArgumentException) {
                println("Erro: ${e.message}")
                field = 0.0
            }
        }

    // Função para exibir os dados
    fun exibirDados() {
        val monitoramentoStr = if (possuiProgramaMonitoramento) "Sim" else "Não"
        println("Tipo de Ambiente: $tipoAmbiente")
        println("Área Protegida: $areaProtegida km2")
        println("Possui Monitoramento: $monitoramentoStr")
    }
}


