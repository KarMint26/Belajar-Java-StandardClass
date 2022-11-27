public class Materi_Java_StandardClass {
    public static void main(String[] args) {

        /*
         * String Class
         * String adalah object, artinya dia memiliki representasi class-nya.
         * Ada banyak sekali method yang bisa kita gunakan di String, kita bisa melihat detail method
         * apa saja yang tersedia di halaman dokumentasi javadoc nya.
         * https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/String.html
         */

        /*
         * Immutable String
         * String adalah tipe data immutable, artinya tidak bisa berubah isinya, saat kita mengubah String,
         * sebenarnya yang dilakukan di Java adalah membuat String Baru.
         * Jika kita ingin memanipulasi String dalam jumlah banyak, sangat tidak disarankan menggunakan
         * String, karena akan memakan memory yang cukup besar, untuk kasus seperti ini, disarankan
         * menggunakan StringBuffer atau StringBuilder.
         *
         * StringBuffer vs StringBuilder
         * Kemampuan StringBuffer & StringBuilder cukup sama, bisa digunakan untuk memanipulasi String.
         * Yang membedakan adalah, StringBuffer itu Thread Safe, sedangkan StringBuilder tidak Thread Safe.
         * Jika kita ingin memanipulasi String secara paralel bersamaan, disarankan menggunakan StringBuffer,
         * namun jika tidak butuh paralel, cukup gunakan StringBuilder.
         * Karena StringBuffer dibuat agar thread safe, maka secara otomatis performanya lebih lambat dibandingkan
         * StringBuilder.
         * https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/StringBuffer.html
         * https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/StringBuilder.html
         */

        /*
         * StringJoiner Class
         * Adalah class yang bisa digunakan untuk membuat String sequence yang dipisahkan dengan delimiter.
         * StringJoiner juga mendukung prefix dan suffix jika kita ingin menambahkannya.
         * Ini sangat bagus ketika ada kasus misal kita ingin mem-print Array dengan format yang kita mau
         * misalnya.
         * https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/util/StringJoiner.htm
         */

        /*
         * StringTokenizer
         * Adalah class yang bisa digunakan untuk memotong String menjadi token atau string yang lebih kecil.
         * Kita bisa memotong String dengan delimiter yang kita mau.
         * https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/StringTokenizer.html
         */

        /*
         * Number Class
         * Semua number class yang bukan primitif memiliki parent class yang sama, yaitu class Number.
         * Class Number memiliki banyak method yang bisa digunakan untuk mengkonversi ke tipe number lain.
         * Hal ini memudahkan kita untuk mengkonversi object number dari satu tipe ke tipe number lainnya.
         * https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/Number.html
         *
         * Konversi String ke Number
         * Long,Integer,Short, dan Byte memiliki static method untuk melakukan konversi dari String ke Number.
         * parseXxx(String) digunakan untuk mengkonversi dari String ke tipe data Number Primitif.
         * valueOf(String) digunakan untuk mengkonversi dari String ke tipe data Number Non Primitif.
         * Method ini akan throw NumberFormatException jika ternyata gagal melakukan konversi String ke Number.
         */

        /*
         * Math Class
         * Class Math merupakan class utilities yg berisikan banyak sekali static method untuk operasi
         * numerik, seperti Trigonometric, Logarithm, Akar Pangkat, dll.
         * https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/Math.html
         */

        /*
         * Big Number
         * Jika kita ada kebutuhan untuk menggunakan angka yang besar sehingga melebihi kapasitas Long
         * dan Double, di Java sudah disediakan class untuk handle data besar tersebut.
         * BigInteger adalah class untuk handle tipe data Integer, dan
         * BigDecimal adalah class untuk handle tipe data Floating Point.
         * https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/math/BigInteger.html
         * https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/math/BigDecimal.html
         *
         * Method               Operator
         * add                  +
         * subtract             -
         * multiply             *
         * divide               /
         * mod                  %
         */

        /*
         * Scanner Class
         * Scanner sebenarnya bagian dari Java IO (Input Output).
         * Class Scanner hadir sejak Java 5.
         * Class Scanner adalah class yang bisa digunakan untuk membaca input, entah dari file, console, dll.
         * Class Scanner ini cocok untuk dijadikan object untuk membaca input user saat kita belajar membuat
         * program Java menggunakan console/terminal.
         * https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/util/Scanner.html
         *
         * Method           Keterangan
         * nextLine()       untuk membaca String
         * nextInt()        untuk membaca int
         * nextLong()       untuk membaca long
         * nextBoolean()    untuk membaca boolean
         * dll
         */

        /*
         * Date & Calendar
         * Tiap bahasa pemrograman biasanya memiliki representasi tanggal, di Java juga sama, ada class
         * Date & Calendar yang bisa kita gunakan sebagai representasi tanggal.
         * Sebenarnya di Java 8 sudah ada cara manipulasi tanggal yang baru menggunakan Java Date Time API.
         *
         * Hubungan Date dan Calendar
         * Class Date adalah class representasi tanggal sampai presisi milisecond.
         * Namun di class Date sudah banyak method2 yang di Deprecated, sehingga untuk memanipulasi Date
         * tanggal, kita sekarang harus melakukan kombinasi antara Class Date dan Calendar.
         * Sederhananya Date untuk representasi Tanggal, dan Calendar untuk memanipulasi tanggal.
         * https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/util/Date.html
         * https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/util/Calendar.html
         */

        /*
         * System Class
         * Class System adalah class yang berisikan banyak utility static method di Java, contohnya
         * Sebelumnya kita sudah sering menggunakan method println milik field out di class System.
         * https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/System.html
         *
         * Method Di System Class
         * Method                       keterangan
         * String getenv(key)           Mendapatkan environmetn variable operating system.
         * void exit(Status)            Menghentikan Program Java.
         * long currentTimeMillis()     mendapatkan waktu saat ini dalam milisecond.
         * long nanoTime()              Mendapatkan waktu saat ini dalam nanosecond.
         * void gc()                    Menjalankan Java Garbage Collection.
         * dll
         */

        /*
         * Runtime Class
         * Ketika Aplikasi Java kita berjalan, kita bisa melihat informasi environment tempat aplikasi Java berjalan.
         * Informasi itu terdapat di Class Runtime.
         * Class Runtime tidak bsia dibuat, secara otomatis java akan membuat single object. Kita bisa mengakses
         * object tersebut menggunakan static method getRuntime() milik class Runtime.
         * https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/Runtime.html
         *
         * Method di Runtime Class
         * Method                           keterangan
         * int availableProcessors()        Mendapatkan jumlah core cpu
         * long freeMemory()                Mendapatkan jumlah memory bebas di JVM
         * long totalMemory()               Mendapatkan jumlah total memory di JVM
         * long maxMemory()                 Mendapatkan jumlah maksimum memory di JVM
         * void gc()                        Menjalankan garbage collector untuk menghilangkan data di memory yang sudah
         *                                  tidak terpakai.
         */

        /*
         * UUID Class
         * Saat membuat aplikasi, kadang kita ada kasus ingin membuat data unique, misal untuk kebutuhan data
         * primary key misalnya.
         * Java menyediakan sebuah class UUID atau singkatan dari Universally Unique Identifier.
         * UUID adalah format standard untuk emmbuat unique value yang telah terjamin.
         * https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/util/UUID.html
         * https://www.ietf.org/rfc/rfc4122.txt
         */

        /*
         * Base64 Class
         * Sejak Java 8, java sudah menyediakan class untuk melakukan encoding base 64.
         * Buat programmer web pasti tahu tentang Base64, yaitu encoding yang bisa digunakan untuk mengubah
         * binary data ke text yang aman.
         * Aman disini bukan dari sisi security, tapi aman dari kesalahan parsing.
         * https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/util/Base64.html
         * https://www.ietf.org/rfc/rfc4648.txt
         */

        /*
         * Objects Class
         * Awas jangan tertukar, ini class Objects, bukan Object.
         * Objects adalah class utility yang berisikan banyak static method yang bisa kita gunakan untuk
         * operasi Object atau melakukan pengecekan sebelum operasi nya dilakukan.
         * https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/util/Objects.html
         */

        /*
         * Random Class
         * adalah class yang bisa kita gunakan untuk men-generate Random Number.
         * https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/util/Random.html
         */

        /*
         * Properties file
         * Kebanyakan aplikasi Java akan menyimpan configurasi file dalam bentuk properties file.
         * Properties file adalah file yang berisi key value yang dipisahkan dengan tanda sama dengan (=).
         * Properties file bisa kita gunakan untuk menyimpan konfigurasi aplikasi kita.
         *
         * Properties Class
         * adalah class yang bisa kita gunakan untuk emngambil atau menyimpan informasi ke file properties.
         * https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/util/Properties.html
         */

        /*
         * Arrays Class
         * Adalah class yang berisikan static method yang bisa kita gunakan untuk memanipulasi data array, seperti
         * pencarian dan pengurutan.
         * https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/util/Arrays.html
         *
         * Method di Arrays Class
         * Method                           Keterangan
         * binarySearch(array, value)       Mencari value di array
         * copyOf(...)                      Menyalin data array
         * equals(array1, array2)           membandingkan array 1 dan array 2
         * sort(array)                      Mengurutkan array
         * toString(array)                  Mengembalikan representasi String.
         * dll
         */

        /*
         * Regular Expression (regex)
         * Regex adalah cara untuk melakukan pola pencarian.
         * Biasanya dilakukan untuk pencarian dalam data string.
         * Secara sederhana, kita mungkin sudah sering melakukan pencarian text, entah di text editor atau di
         * aplikasi word.
         * Regex adalah pencarian yang lebih advanced dibanding pencarian text biasanya, misal kita ingin mencari
         * semua kata yang mengandung diawali huruf a dan diakhiri huruf a, dll.
         *
         * Regex Package
         * Java sudah menyediakan package java.util.regex yang diberikan utilitas untuk melakukan proses Regular
         * Expression. Secara garis besar terdapat 2 class yang dapat kita gunakan, yaitu Pattern class dan Matcher
         * class.
         * Pattern Class adalah representasi hasil kompilasi dari pola regular expression yang kita buat.
         * Matcher Class adalah engine untuk melakukan pencarian dari pattern yang sudah kita buat.
         *
         * Aturan Regular Expression
         * Aturan regex sangat kaya, sehingga kemungkinan tidak bisa dibahas dalam satu materi.
         * Kita bisa lihat detail aturan-aturannya di halaman javadoc class Pattern.
         * https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/util/regex/Pattern.html
         */

    }
}
