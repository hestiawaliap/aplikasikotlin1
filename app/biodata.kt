package com.example.applikasikotlin

data class Biodata(
    val nama: String,
    val birthDate: String,
    val age: Int,
    val address: String,
    val phoneNumber: String,
    val email: String
)

data class Person(
    val status: String,
    val university: String,
    val major: String,
    val semester: String
) {
    fun introduce() {
        println("[======================== BIODATA HESTI ========================]") //Judul halaman
        println("Saya adalah mahasiswi dari Politeknik Negeri Madiun $status semester 2 $semester $university dari Program Studi D-III Teknologi Informasi $major")
    }
}

fun main() {
    val person = Person("Mahasiswi", "Politeknik Negeri Madiun", "D-III Teknologi Informasi", "semester 2")
    val biodata = Biodata(
        "Hesti Awalia Putri",
        "Ponorogo, 11 Agustus 2004",
        20,
        "Sukorejo, Ponorogo",
        "815-1562-1744",
        "hestiawaliaputri86@gmail.com"
    )
    person.introduce()
    printBiodata(biodata)
    printHobi("memasak")
    person.introduce()
    printBiodata(biodata)

    person.introduce()
    print(" ")

    val hobi = "memasak"
    printHobi(hobi)
}

fun printBiodata(biodata: Biodata) {
    println("---------------------------------------------------------------------------")
    println("# biodata saya ")
    println("---------------------------------------------------------------------------")
    println("Nama Lengkap: ${biodata.nama}")
    println("TTL: ${biodata.birthDate}")
    println("Umur: ${biodata.age} tahun")
    println("Alamat: ${biodata.address}")
    println("No. HP: +62 ${biodata.phoneNumber}")
    println("E-mail: ${biodata.email}")
}

fun printHobi(hobby: String) {
    println("---------------------------------------------------------------------------")
    println("# hobi saya")
    println("---------------------------------------------------------------------------")
    println("Sejak kecil, saya selalu tertarik dengan$hobby proses memasak. Saya suka membantu ibu di dapur $hobby Namun, semakin saya tumbuh dewasa, semakin dalam juga cinta saya pada memasak.")
}