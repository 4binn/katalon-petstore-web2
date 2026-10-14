# Pengujian Otomatis Web Petstore Menggunakan Katalon Studio

## Deskripsi Proyek

Repository ini berisi proyek **Pengujian Otomatis Antarmuka Web (Web UI Automation Testing)** yang dikembangkan menggunakan Katalon Studio. Proyek ini bertujuan untuk mempraktikkan pengujian otomatis pada aplikasi web, memvalidasi interaksi pengguna, serta memastikan fungsi aplikasi berjalan sesuai dengan hasil yang diharapkan.

Proyek ini menggunakan pendekatan pengujian terstruktur melalui Test Cases, Test Suites, Object Repository, dan Data Files.

## Tujuan Pengujian

- Mempelajari pengujian otomatis antarmuka web menggunakan Katalon Studio.
- Memvalidasi fungsi aplikasi melalui test case otomatis.
- Mengelola objek dan elemen web menggunakan Object Repository.
- Menjalankan pengujian melalui Test Suites.
- Meningkatkan cakupan pengujian dan kemudahan pemeliharaan skrip otomatis.

## Tools dan Teknologi

- **Katalon Studio** — Alat untuk otomatisasi pengujian web.
- **Groovy** — Bahasa skrip untuk kebutuhan pengujian.
- **Git dan GitHub** — Pengelolaan versi dan dokumentasi proyek.

## Struktur Proyek

```text
katalon-petstore-web2/
├── Data Files/
├── Drivers/
├── Include/
├── Keywords/
├── Object Repository/
├── Profiles/
├── Scripts/
├── Test Cases/
├── Test Suites/
├── settings/
└── katalon-petstore-web.prj
```

*Catatan: Struktur di atas merupakan contoh struktur proyek Katalon. Sesuaikan dengan isi repository yang sebenarnya.*

## Pendekatan Pengujian

Proses pengujian dilakukan melalui tahapan berikut:

1. Mengidentifikasi fungsi aplikasi yang akan diuji.
2. Menyusun test case berdasarkan hasil yang diharapkan.
3. Mengelola elemen web yang digunakan dalam pengujian melalui Object Repository.
4. Menjalankan pengujian otomatis menggunakan Katalon Studio.
5. Membandingkan hasil aktual dengan hasil yang diharapkan.
6. Menganalisis hasil pengujian untuk mengidentifikasi kegagalan atau ketidaksesuaian.

## Cara Menjalankan Proyek

1. Unduh repository menggunakan perintah berikut:

   ```bash
   git clone https://github.com/4binn/katalon-petstore-web2.git
   ```

2. Buka aplikasi Katalon Studio.
3. Pilih menu **File → Open Project**, kemudian buka file proyek berekstensi `.prj`.
4. Periksa test case dan Test Suite yang tersedia.
5. Sesuaikan URL aplikasi target dan konfigurasi pengujian jika diperlukan.
6. Jalankan test case secara individual atau melalui Test Suite.
7. Periksa hasil eksekusi pada Katalon Studio.

## Hasil Pengujian

Hasil pengujian dapat diperiksa melalui Katalon Studio untuk mengetahui test case yang berhasil (*Passed*), gagal (*Failed*), atau belum selesai dijalankan.

## Pengembang

**4binn**

GitHub: https://github.com/4binn

## Lisensi dan Penggunaan

Proyek ini dibuat untuk tujuan pembelajaran, latihan, dan demonstrasi kemampuan pengujian otomatis antarmuka web.
