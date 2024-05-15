class ContaCorrente(var numDaConta: int, var saldo double){
     fun depositar(valor: Double) {
        saldo += valor
    }  
    fun sacar(valor: Double) {
        saldo -= valor    
    }
}
