package com.example.applikasikotlin.example.myapp
data class Menu (var makanan: String, var minuman: String, var hargaMakanan: Int, var hargaMinuman: Int) {
    fun updateMakanan(newMakanan: String) {
        makanan = newMakanan
    }

    fun updateMinuman(newMinuman: String) {
        minuman = newMinuman
    }
}

class Pembeli (var nama: String, var jumlahPesanan: Int, var totalHarga: Int) {
    fun updateTotalHarga(menu: Menu) {
        totalHarga = menu.hargaMakanan * jumlahPesanan + menu.hargaMinuman * jumlahPesanan
    }
}

fun main() {
    val myMenu = Menu("mie ayam", "Es jeruk", 8000, 4000)
    val myPembeli = Pembeli("Hesti", 5, 12000)
    println("Pesanan atas nama ${myPembeli.nama} telah memesan item sebanyak ${myPembeli.jumlahPesanan} item")
    println("yaitu ${myMenu.makanan} dengan harga Rp ${myMenu.hargaMakanan} dan ${myMenu.minuman} dengan harga Rp ${myMenu.hargaMinuman} ")
    myPembeli.updateTotalHarga(myMenu)
    println("total harga pembelian 5 item mie ayam dan Es jeruk berjumlah Rp ${myPembeli.totalHarga}") }