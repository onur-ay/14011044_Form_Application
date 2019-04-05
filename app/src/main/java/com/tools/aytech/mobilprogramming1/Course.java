package com.tools.aytech.mobilprogramming1;

import java.util.ArrayList;

public class Course {

    private Course() {
    }

    private String courseName;
    private String courseLecturer;
    private String courseGradeAvg;
    private String courseGrade;
    private String courseStudentQuota;
    private String courseTarget;
    private String courseContent;
    private int imageID;

    public String getCourseGrade() {
        return courseGrade;
    }

    public void setCourseGrade(String courseGrade) {
        this.courseGrade = courseGrade;
    }

    public String getCourseTarget() {
        return courseTarget;
    }

    public void setCourseTarget(String courseTarget) {
        this.courseTarget = courseTarget;
    }

    public String getCourseContent() {
        return courseContent;
    }

    public void setCourseContent(String courseContent) {
        this.courseContent = courseContent;
    }

    public String getCourseGradeAvg() {
        return courseGradeAvg;
    }

    public void setCourseGradeAvg(String courseGradeAvg) {
        this.courseGradeAvg = courseGradeAvg;
    }

    public String getCourseStudentQuota() {
        return courseStudentQuota;
    }

    public void setCourseStudentQuota(String courseStudentQuota) {
        this.courseStudentQuota = courseStudentQuota;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseLecturer() {
        return courseLecturer;
    }

    public void setCourseLecturer(String courseLecturer) {
        this.courseLecturer = courseLecturer;
    }

    int getImageID() {
        return imageID;
    }

    private void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public static ArrayList<Course> getData() {
        ArrayList<Course> courseList = new ArrayList<>();
        int courseImages[] = {
                R.drawable.algorithm_analysis_image,
                R.drawable.artificial_intelligence_image,
                R.drawable.artificial_neural_network_image,
                R.drawable.big_data_image,
                R.drawable.data_communication_image,
                R.drawable.mobile_programming_image,
                R.drawable.network_technologies_image,
                R.drawable.object_oriented_programming_image,
                R.drawable.theory_of_computation_image,
                R.drawable.physics_image,
                R.drawable.mathematics_1_image,
                R.drawable.mathematics_2_image,
                R.drawable.numerical_analysis_image,
                R.drawable.statistics_and_probability_image,
                R.drawable.electronic_circuits_image,
                R.drawable.computer_hardware_image,
                R.drawable.structural_programming_image,
                R.drawable.database_management_image,
                R.drawable.microprocessors_systems_image,
                R.drawable.operating_systems_image,
                R.drawable.statistical_data_analysis_image,
                R.drawable.data_mining_image
        };

        String[] courseNames = {
                "Algorithm Analysis",
                "Artificial Intelligence",
                "Introduction Artificial Neural Network",
                "Big Data Processing and Analysis",
                "Data Communication",
                "Introduction to Mobile Programming",
                "Network Technologies",
                "Object Oriented Programming",
                "Theory of Computation",
                "Physics-I",
                "Mathematics-I",
                "Mathematics-II",
                "Numerical Analysis",
                "Statistics and Probability Calculations",
                "Electronic Circuits",
                "Computer Hardware",
                "Structural Programming",
                "Database Management",
                "Microprocessor's Systems",
                "Operating Systems",
                "Statistical Data Analysis",
                "Introduction to Data Mining"
        };

        String[] courseLecturers = {
                "Lecturer     : M. Elif KARSLIGİL ",
                "Lecturer     : M. Fatih AMASYALI ",
                "Lecturer     : Sırma YAVUZ ",
                "Lecturer     : M. Sıddık AKTAŞ ",
                "Lecturer     : A. Gökhan YAVUZ ",
                "Lecturer     : Amaç GÜVENSAN ",
                "Lecturer     : A. Gökhan YAVUZ ",
                "Lecturer     : Y. Emre SELÇUK ",
                "Lecturer     : Ö. Özgür BOZKURT ",
                "Lecturer     : Merih SERİN ",
                "Lecturer     : Serpil USLU ",
                "Lecturer     : Serpil USLU ",
                "Lecturer     : Banu DİRİ ",
                "Lecturer     : Oğuz ALTUN ",
                "Lecturer     : Gökhan BİLGİN ",
                "Lecturer     : Songül ALBAYRAK ",
                "Lecturer     : Y. Emre SELÇUK ",
                "Lecturer     : M. Utku KALAY ",
                "Lecturer     : Erkan USLU ",
                "Lecturer     : Z. Cihan TAYŞİ ",
                "Lecturer     : Nizamettin AYDIN ",
                "Lecturer     : Songül ALBAYRAK "
        };

        String[] courseGrades = {
                "Grade          : 4.0 ",
                "Grade          : 3.0 ",
                "Grade          : 2.5 ",
                "Grade          : 3.0 ",
                "Grade          : 2.0 ",
                "Grade          : 3.0 ",
                "Grade          : 2.5 ",
                "Grade          : 4.0 ",
                "Grade          : 3.5 ",
                "Grade          : 3.0 ",
                "Grade          : 2.0 ",
                "Grade          : 3.0 ",
                "Grade          : 3.0 ",
                "Grade          : 2.0 ",
                "Grade          : 1.5 ",
                "Grade          : 1.5 ",
                "Grade          : 1.5 ",
                "Grade          : 2.5 ",
                "Grade          : 2.5 ",
                "Grade          : 2.5 ",
                "Grade          : 3.5 ",
                "Grade          : 3.0 ",
        };

        String[] courseGradeAvgs = {
                "Avg. Grade : 3.1 / 4.0 ",
                "Avg. Grade : 3.6 / 4.0 ",
                "Avg. Grade : 3.2 / 4.0 ",
                "Avg. Grade : 2.8 / 4.0 ",
                "Avg. Grade : 2.4 / 4.0 ",
                "Avg. Grade : 2.6 / 4.0 ",
                "Avg. Grade : 3.1 / 4.0 ",
                "Avg. Grade : 2.6 / 4.0 ",
                "Avg. Grade : 2.6 / 4.0 ",
                "Avg. Grade : 2.6 / 4.0 ",
                "Avg. Grade : 2.8 / 4.0 ",
                "Avg. Grade : 3.1 / 4.0 ",
                "Avg. Grade : 2.2 / 4.0 ",
                "Avg. Grade : 3.0 / 4.0 ",
                "Avg. Grade : 3.0 / 4.0 ",
                "Avg. Grade : 3.0 / 4.0 ",
                "Avg. Grade : 2.9 / 4.0 ",
                "Avg. Grade : 1.9 / 4.0 ",
                "Avg. Grade : 2.5 / 4.0 ",
                "Avg. Grade : 2.7 / 4.0 ",
                "Avg. Grade : 2.4 / 4.0 ",
                "Avg. Grade : 3.5 / 4.0 ",
        };

        String[] courseStudentQuotas = {
                "Stu. Quota  : 60 ",
                "Stu. Quota  : 70 ",
                "Stu. Quota  : 80 ",
                "Stu. Quota  : 60 ",
                "Stu. Quota  : 60 ",
                "Stu. Quota  : 60 ",
                "Stu. Quota  : 60 ",
                "Stu. Quota  : 60 ",
                "Stu. Quota  : 80 ",
                "Stu. Quota  : 80 ",
                "Stu. Quota  : 80 ",
                "Stu. Quota  : 80 ",
                "Stu. Quota  : 90 ",
                "Stu. Quota  : 90 ",
                "Stu. Quota  : 90 ",
                "Stu. Quota  : 60 ",
                "Stu. Quota  : 70 ",
                "Stu. Quota  : 50 ",
                "Stu. Quota  : 40 ",
                "Stu. Quota  : 60 ",
                "Stu. Quota  : 70 ",
                "Stu. Quota  : 60 "
        };

        String[] courseTargets = {
                "Target         : Dersin amacı, belli başlı algoritma sınıflarının tasarımı ve analizi için ileri teknikleri tanıtmak ve farklı uygulama alanlarını göstermektir.",
                "Target         : Yapay Zeka Metotlarını kullanarak problem çözme yeteneği kazanmak",
                "Target         : Yapay Sinir Ağları alanındaki temel problemleri ve çözümlerini öğrenmek.",
                "Target         : Bu dersin amacı, öğrencilere büyük veri uygulamaları için programlama modellerini, büyük veri algoritmalarını ve büyük veri programlama araçlarını öğretmek olacaktır. Öğrenciler büyük veri programlama platformları ile ilgili en yeni teknolojileri öğrenecektir.",
                "Target         : Bu dersin amacı kombinasyonel ve ardışıl devrelere bir bakış sağladıktan sonra öğrencilere bilgisayar donanımında kullanılan teknolojiler, pipeline komut işleme, ön bellekler ve sanal bellek ile ilgili bilgi vermektir.",
                "Target         : OSI başvuru modeli uyarınca ilk dört katmanın görevlerini, yerel ve geniş alan ağlarının çalışma presiplerini öğrenmek ve veri iletim teknolojileri hakkında bilgi sahibi olmak.",
                "Target         : Veri Madenciliğinin amacı veri yığınından faydalı bilgiyi bulup çıkartmak ve keşfedilen bilgiyi kullanarak mevcut durumu açıklamaya yardımcı olmak ve gelecekteki oluşumları tahmin etmektir.",
                "Target         : Veritabanı tasarımı ve kullanım ve yönetiminin anlaşılması.",
                "Target         : Temel elektronik elemanlar olan diyot, BJT ve FET transistörlerini ve OP-AMP yapılarını öğretmek ve bu elemanlarla oluşturulan devrelerin analiz ve sentezleme becerisini kazandırmak.",
                "Target         : Temel Matematik bilgisini vermek ve analitik düşünme becerisini sağlamak.",
                "Target         : Dizi ve seri konusunda öğrenciyi detaylı olarak bilgilendirmek ve çok değişkenli fonksiyonlarda limit, süreklilik, kısmi türev, iki katlı integral kavramlarını kullanma becerisi sağlamak.",
                "Target         : Intel mikroişlemcileri ile çevre birimleri ve bellek organizasyonlarına ilişkin teori ve uygulamanın öğrenilmesi.",
                "Target         : Dersin amacı öğrencilerin mobil cihazlar için uygulama geliştirebilecek bilgi birikimine ve yeni nesil mobil teknolojiler hakkında temel bilgilere sahip olmalarını sağlamak",
                "Target         : Bilgisayar ağları ile bu ağları oluşturan yazılım ve donanım unsurlarının analiz, tasarım ve gerçeklenmesinin öğretilmesi.",
                "Target         : Çözümünün elle yapılması pratik olmayan karmaşık problemlerin yaklaşık sayısal çözümler ile nasıl çözüleceğinin anlatılması.",
                "Target         : Nesneye yönelik programlama yaklaşımına göre UML eşliğinde ve Java dili ile tasarım ve kodlama yapabilmek",
                "Target         : İşletim sistemleri ile bu sistemleri oluşturan yazılım ve donanım unsurlarının öğretilmesi.",
                "Target         : Temel fiziğin mekanik dalının temel kavram ve prensiplerini öğrenciye ayrıntılı bir biçimde öğretmek. Bunların gerçek dünyadaki uygulamalarla birlikte anlaşılırlığını sağlamak ve daha sonra görecegi derslere temel oluşturmak.",
                "Target         : Çeşitli problemlerin temel istatistiksel yöntemler kullanılarak çözülmesi",
                "Target         : Belirsizlik içeren problemlerin olasılıksal ve istatistiksel yöntemler ile modellenmesinin ve çözülmesinin öğrenilmesi.",
                "Target         : C programlama dilinin etkin kullanımının öğretilmesi",
                "Target         : Bu dersin amacı, öğrencilere, otomata teorisi ve biçimsel diller ve gramerler teorisini içeren hesaplamanın matematiksel temellerini tanıtmak; aynı zamanda otomatlar, eşdeğer düzenli ifadeler, otomatlar tarafından tanımlanan dillerin eşdeğerliği, düzenli ifadeler, pushdown otomatı, eşdeğer context-free gramerleri, pushdown otomata tarafından tanımlanan dillerin eşdeğeri, bağlam gibi temel kavramları kavratmaktır. ücretsiz gramerler, Turing makineleri ve Turing makineleri tarafından tanımlanan dillerin eşdeğerliği.",
        };

        String[] courseContents = {
                "Content       : Efektif Algoritma Analizinin Temelleri, Asimptotik Notasyonlar, Böl ve Yönet Algoritmalarının Analizi, Hashing Algoritmaları, Graf Algoritmaları, Dengeli Arama Ağaçları, Dinamik Programlama, Geriye dönüş Algoritmaları, P, NP, NP-Complete Problemler",
                "Content       : Yapay Zeka metotlarının, dillerinin oğrenilmesi ve uygulamalarının yapılması, bir problemin bu metotlara uygunluğunun anlasılması",
                "Content       : Temel Yapay Sinir ağı algoritmalarının ve uygulama alanlarının öğrenilmesi, bir problemin bu metotlara uygunluğunun anlaşılması.",
                "Content       : Dersin içerinde, büyük veri algoritmaları, büyük veri programlama paradigmaları ve platformları, büyük veri analizi araçları işlenecektir. Bunun yanı sıra büyük veri araştırma alanında çok sayıda araştırma makalesinin öğrenilmesi, sunulması, tartışılması sağlanacaktır.",
                "Content       : Bu derste, merkezi işlem birimi ve kontrol devresinin tasarımı, giriş-çıkış birimleri ve haberleşme, bellek yapıları ve yönetimi öğretilmektedir.",
                "Content       : OSI Başvuru Modeli; İşaretleşme; Bilgi Kodlama Teknikleri, Seri ve Paralel İletim; İletim Ortamlarının Özellikleri; Hata Algılama ve Düzeltme; Akış Kontrol Teknikleri; Anuyumlu/Anuyumsuz İletim; Bağlantı Yönelimli ve Bağlantı Yönelimsiz Servislerin Özellikleri; Anahtarlama; Yerel Alan Ag Teknolojileri, Geniş Alan Ağ Teknolojileri; IP, TCP ve UDP;",
                "Content       : Veri Madenciliği Kavramları, Veri Hazırlama Teknikleri, İstatistiksel Öğrenme Teorisi(Naive Bayes), Kümeleme Metodları (K-Means, hiyerarşik), Karar Ağaçları ve Karar Kuralları, Birliktelik Kurallarını",
                "Content       : Kavramsal Tasarımda ER/UML Modeli; Mantıksal Tasarımda İlişkisel Model; İlişkisel Cebir; Yapısal Sorgulama Dili (SQL); Veri Bütünlüğü Programlama (Sağlama Fonksiyonlar, Tetikleyici Fonksiyonlar); Veritabanı Programlama (Saklı Yordamlar, Gömülü SQL, JDBC); Yarı-yapısal Veri Modelleme; XML; XML Programlama Dilleri (XPath, XQuery)",
                "Content       : Diyot; Diyot Uygulamaları; Diyot Lojik; Bipolar Jonksiyonlu;Transistör (BJT); BJT’li Devrelerin DC Analizi; Diyot Transistör Lojik (DTL); Direnç Transistör Lojik (RTL); Transistör Transistör Lojik (TTL); İşlemsel Yükselteç (OP-AMP) ve Uygulamaları; Alan Etkili Transistör (FET); Jonksiyonlu Alan Etkili Transistör (JFET); Metal Oksit Yarıiletken Alan Etkili Transistör (MOSFET); Alan Etkili Transistörlü Devrelerin DC analizi; MOS Lojik.",
                "Content       : Fonksiyonlar: Tanım Kümesi, Fonksiyonlar ve Grafikleri, Çift-tek Fonksiyonlar, Simetri, Fonksiyonlarda İşlemler (Toplamı, Farkı, Çarpımı, Bölümü ve Katları), Bileşke Fonksiyonlar, Parçalı Fonksiyonlar, Polinomlar ve Rasyonel Fonksiyonlar, Trigonometrik Fonksiyonlar,Limit ve Süreklilik: Bir Fonksiyonun Limiti ve Limit Kuralları, Sandviç (Sıkıştırma) Teoremi, Limitin Kesin Tanımı, Tek Taraflı Limitler, Sonsuzluğu İçeren Limitler, Sonsuz limitler,Süreklilik: Bir noktada süreklilik, Sürekli Fonksiyonlar, Ara Değer Teoremi, Süreksizlik Çeşitleri. Türev: Teğet ve Normal Doğrular, Bir Noktada Türev, Bir Fonksiyon Olarak Türev, Tek Taraflı Türevler,Bir Aralık Üzerinde Türev, Türev Kuralları, Yüksek Mertebeden Türevler, Trigonometrik Fonksiyonların Türevleri, Zincir Kuralı, ...",
                "Content       : Sonsuz Diziler: Yakınsama ve Iraksama, Dizilerin Yakınsaklık ve Iraksaklığı, Dizilerin Limitlerinin Hesaplanması, Diziler İçin Sandviç (Sıkıştırma) Teoremi, Dizilerde Sürekli Fonksiyon Teoremi, Sıkça Rastlanan Limitler, Tekrarlı Tanımlanan Diziler, Sınırlı Monoton Diziler, Monoton Dizi Teoremi.Sonsuz Seriler: Geometrik Seriler, Iraksak Seriler İçin n. Terim Testi, Serileri Birleştirmek, Terim Eklemek veya Terim Silmek,Pozitif Terimli Seriler için Yakınsaklık Testleri: İntegral Testi, p Serisi, Harmonik Seri, Karşılaştırma Testi, Limit Karşılaştırma Testi, Oran Testi, Kök Testi.Alterne Seriler: Alterne Harmonik Seri, Alterne Seri Testi (Leibniz Testi), Mutlak ve Şartlı Yakınsaklık. Kuvvet Serileri: Bir Kuvvet Serisinin Yakınsaklık Yarıçapı, Kuvvet Serilerinde İşlemler, ...",
                "Content       : Intel 8086 ve 286 Mimarisi; Giriş-Çıkış Birimi; 8255 PPI; 8251 USART; 8254 PIT; ADC ve DAC; Kesme İstekleri; 8259 PIC; Bellek Yapıları; Adres Çözümleme",
                "Content       : Mobil Teknolojilere Genel Bakış ; Mobil Cihazlar ; Mobil İşletim Sistemleri ; Mobil Uygulama Geliştirmenin Temelleri ; Mobil Uygulama Bileşenleri ; Uygulama Yaşam Döngüsü ; Kullanıcı Arayüzü Tasarımı ; Menüler ; Diyalog Kutuları ; ListView ; ViewPager ; ArrayAdapters ; Akıllı Telefonlarda Veri Yönetimi ; Dosya İşlemleri ; Veritabanları Algılayıcılar ; Veri Toplama Yöntemleri ; Broadcast Receivers ; Content Providers ; Bildirimler ; Mobil Uygulamalardaki İzin ve Haklar ; Lokasyon-Tabanlı Servisler ; Arkaplan Görevler",
                "Content       : OSI referans modelinin 3 ile 7 katmanları, TCP/IP protokol yapısı, TCP/IP ağ uygulamaları.",
                "Content       : Sayısal Analizin temel konuları olan Hatalar ve Yanlışlar, Eşitliklerin Köklerinin Bulunması, Doğrusal ve Doğrusal Olmayan Denklem Takımlarının Çözümü, Sayısal Integral, Sayısal Türev, Fark Tablosu, Enterpolasyon, Eğri Uydurma ve Kısmi Diferansiyel Denklemler anlatılacaktır.",
                "Content       : Sınıflar, Nesneler ve Üyeler; Final ve Static Üyeler; Kurucu ve Sonlandırıcı Metotlar; UML Sınıf Şemaları; Komut Satırı Giriş/Çıkış İşlemleri; Denetim Akışı; Sınıflar ve Nesneler Arasındaki İlişkiler (Sahiplik, Kullanma, Parça-Bütün, Kalıtım); Metotların Yeniden Tanımlanması ve Çoklu Tanımlanması; İlkeller ve Sarmalayıcılar; Enum Yapıları; Aykırı Durum İşleme; Dosya İşlemleri; Jenerik Sınıflar; Temel Veri Yapılarının Kullanımı; Paralel Programlamaya Giriş;",
                "Content       : İşletim sistemlerin genel yapısı, donanım ve yazılım özellikleri, çeşitleri ve uygulama alanları.",
                "Content       : Fizik, Standart boyut ve birimler, Vektörler, Bir boyutta hareket, İki ve üç boyutta Hareket, Dairesel Hareket, Hareket Kanunları ve Newton Kanunlarının Uygulamaları, İş ve Kinetik Enerji, Potansiyel Enerji ve Enerjinin Korunumu, Doğrusal Momentum ve Çarpışmalar, Katı Cismin Sabit Bir Eksen Etrafında Dönmesi, Katı Cismin Hareketli Bir Eksen Etrafında Dönmesi, Tork ve Açısal Momentum, Statik Denge ve Esneklik, Titreşim Hareketi.",
                "Content       : Temel istatistiksel kavramlar, tanımlayıcı istatistik, şartlı olasılık, rasgele değişkenler, tahmin-ayrık-sürekli olasılık modeller, birleşik ve örnek dağılımlar, hipotez testi, güven aralıkları, karmaşıklık matrisi, mantıksal regresyon, doğrusal ve çoklu regresyon ve test teknikleri",
                "Content       : Temel olasılık kuralları, ayrık ve sürekli olasılık modelleri, tanımlayıcı istatistik, giriş seviye istatistiksel sonuç çıkarma",
                "Content       : C Programlama Dilinde Veri Tipleri ; Kontrol Deyimleri ; Döngüler ; Diziler ve İşaretçiler ; Çok Boyutlu Diziler ; İşaretçi Dizileri ; Karakter Dizileri ; Dinamik Bellek Yönetimi ; Fonksiyonlar ; Fonksiyon İşaretçileri ; Özyinelemeli Fonksiyonlar ; Yerel ve Global Değişkenler ; Yapılar ; Bitsel İşlemler ; Dosya İşlemleri ; C Önişlemcileri ; Makrolar ; C için Veri Yapıları ; Linkli Listeler ; Statik ve Dinamik Kütüphaneler",
                "Content       : Dersin İçeriği Matematiksel Araçlar (Tanımlar, Teoremler ve İspatlar); İspat Türleri; Düzenli Diller; Sonlu Otomatlar; Deterministik Olmayan Makinalar; Düzenli İfadeler; Düzensiz Diller; Bağlam İçermeyen (Context-free) Diller; Bağlam İçermeyen (Context-free) Gramerler; Basma Otomatiği; Turing Makineleri; Turing Makinelerinin Çeşitleri; \"Algoritma\" tanımı; Karar Verebilirlik; Kararlanabilir Diller; NP-bütünlüğü; İndirgenebilirlik; Tanınabilirlik.",
        };

        for (int i = 0; i < courseImages.length; i++) {
            Course course = new Course();
            course.setImageID(courseImages[i]);
            course.setCourseName(courseNames[i]);
            course.setCourseLecturer(courseLecturers[i]);
            course.setCourseGrade(courseGrades[i]);
            course.setCourseGradeAvg(courseGradeAvgs[i]);
            course.setCourseStudentQuota(courseStudentQuotas[i]);
            course.setCourseTarget(courseTargets[i]);
            course.setCourseContent(courseContents[i]);

            courseList.add(course);
        }
        return courseList;
    }
}
