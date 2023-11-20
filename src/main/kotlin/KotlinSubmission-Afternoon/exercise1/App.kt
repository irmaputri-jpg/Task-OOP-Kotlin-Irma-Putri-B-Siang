package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val firstName: String = "Irma"
    val lastName: String = "Putri Ningrum"
    val age: Int = 23
    val isSingle: Boolean = true

    println("Nama Depan: $firstName")
    println("Nama Belakang: $lastName")
    println("Umur: $age")
    println("Status: $isSingle")
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    return ""
    println("GrowZen: $groupId")
    println("ADZANNULOH, ADIB, FIKRI, HILDA, IRMA, RISMA, ANGGA, BETA, FIKI, FIKRA: $groupMember")
    println("Afternoon: $session")

}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {

    return listOf("ADZANNULOH, ADIB, FIKRI, HILDA, IRMA, RISMA, ANGGA, BETA, FIKI, FIKRA")
    println("Irma: ${myTeam()}")


}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("Jessica Aulia, Pupu")
    val countOfGroup = arrayOf<String>("ADZANNULOH, ADIB, FIKRI, HILDA, IRMA, RISMA, ANGGA, BETA, FIKI, FIKRA")

    val total = mentor.size + countOfGroup.size

    return total
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("GrowZen: $myTeam")

    val totalMember = totalMember()
    println("10 : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("GrowZen", listOf("ADZANNULOH, ADIB, FIKRI, HILDA, IRMA, RISMA, ANGGA, BETA, FIKI, FIKRA"), "Afternoon")

}