# QA Engineer eFishery Challenge
#### Full Name : Muhammad Luthfi Rasyid Pane 
#### Date : 7 September 2021
#### Applied Position : QA Engineer
<br>

Berikut adalah beberapa pertanyaan dan tasks yang perlu dijawab sebagai bagian dari kandidat QA Eng:<br>
1. Bug Cycle (pre-production dan post-production) praktikal yang kamu pakai
untuk mempersiapkan test buatmu dan orang lain bagaimana? Lalu apa saja
Artifacts yang kamu pakai? <br>
2. Unit Testing vs Integration Testing, ada opini terkait ini? Menurutmu
baiknya bagaimana dalam praktikal untuk Produk/Fitur baru?<br>
3. Anda diminta untuk eksplorasi halaman https://music.youtube.com/<br>
- Buat Test Cases dengan format spreadsheet sesuai dengan template
yang menurutmu paling nyaman

- Test Case diutamakan untuk fitur-fitur utama Youtube Music tersebut. Tentukan sendiri apa saja yang ingin dibuat Test Case-
nya. Tidak perlu semua fitur, pilih fitur yang menurutmu krusial dan cover sebagian besar common cases.

- Tuliskan alasan memilih template Test Case yang digunakan, serta
tuliskan juga alasan memilih Test Cases yang dibuat untuk
halaman/aplikasi tersebut.

- Outputnya: Spreadsheet Test Cases, Alasan pemilihan template
Test Case dan Test Cases-nya<br>
4. Buat sebuah script sederhana (dengan/tanpa framework testing) untuk
menguji Test Case yang sudah dibuat

- Tidak perlu semua Test Cases, pilih Test Case yang menurutmu
krusial untuk di-cover dengan automation ini. Tuliskan alasannya.

-  Script dapat dibuat dengan NodeJS/Python atau Selenium

-  Output task automation ini disimpan di repo Github beserta
README.md menjalankan testnya

<br>

## Answer

1. Menggunakan test case yang disusun dan diupdate menggunakan test rail untuk reporting dalam bentuk dokumentasi gambar.

2. Unit test biasa nya dilakukan oleh developer untuk testing function dari masing masing service menggunakan mockup data dan bersifat isolated sedangkan integration test dilakukan oleh QA untuk E2E dan menggunakan data real. Untuk unit testing maupun integration testing jika ada fitur baru akan membutuhkan waktu yang cukup lama dalam pengerjaan dibandingkan dengan fitur yang sudah ada hanya tinggal menambahkan scenario baru penambahan pada fitur yang sudah ada.

3. Login  <br>

| Test Case ID | Test Scenario | Test Steps | Test Data | Expected Results | Actual Results | Pass / Fail |
| --- | --- | --- | --- | --- | --- | --- |
| LOG-001 | Verify user login with valid data | <ul><li>User Open Url</li><li>User click button "SignIn"</li><li>User input valid email</li><li>User input valid password</li><li> User directed to home of url</ul>|<ul><li>var email = "fabelio.test@gmail.com" </li><li>var password = "fabelio123"</li><li>var url = "https://music.youtube.com"</li></ul> | User successfully login and directed to homepage | As Expected | PASS |
| LOG-002 | Verify user can not login with invalid data | <ul><li>User Open Url</li><li>User click button "SignIn"</li><li>User input valid email</li><li>User input invalid password</li><li> User get error message "incorrect password"</ul>|<ul><li>var email = "fabelio.test@gmail.com" </li><li>var password = "fabelio12345"</li><li>var url = "https://music.youtube.com"</li></ul> | User unsuccessfully login | As Expected | PASS |
<br>
Search <br>

| Test Case ID | Test Scenario | Test Steps | Test Data | Expected Results | Actual Results | Pass / Fail |
| --- | --- | --- | --- | --- | --- | --- |
| SRC-001 | Verify user play song using searchbox | <ul><li>User Open Url</li><li>User click icon search button </li><li>User input name of band</li><li>User directed to search result page</li><li> User click name of song</ul>|<ul><li>var band = "the 1975" </li><li>var song = "Somebody Else"</li><li>var url = "https://music.youtube.com"</li></ul> | User successfully play a song | As Expected | PASS |

<br>
There is 2 main file and 1 file properties : <br>

- Search.java, SignIn.java<br>
- PropertiesData.java <br>

How to run : <br>

- install JDK (Java Development Kit)<br>

- install [chromedriver](https://chromedriver.chromium.org/downloads)

- Change directory location chromedriver with your location in file PropertiesData.java 

- Running the main file <br>

 ![alt text](https://github.com/luthfipane/eFishery/blob/main/Running.png "Running Java")
