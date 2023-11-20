package id.infinitelearning.KotlinSubmission.exercise4

fun main() {
    val userInput = "456def"

        try {
            val number = userInput.toInt()
            println("Angka yang diinput: $number")
        } catch (e: NumberFormatException) {
            println("Terjadi kesalahan saat konversi: ${e.message}")
        }

}
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
