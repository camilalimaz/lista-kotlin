class Retangulo( val base: Double, val altura: Double) {
    fun calculaArea(): Double {
        return base * altura
    }
    fun calculaPerimetro(): Double {
        return 2 * (base + altura)
    }
}
