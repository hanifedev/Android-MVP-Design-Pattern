# MVP ÖRNEĞİ

## Design Pattern
Tasarım kalıpları, yazılım geliştiricilerin karşılaştıkları genel sorunların çözümüdür.

![MVP Yapısı](https://miro.medium.com/max/778/1*TuWeZzR14MmB-RBbjtZl-A.png)

MVP Tasarım Deseni üç kısımdan oluşur:

*Model: Kullanıcı arayüzünde görüntülenecek veya başka bir şekilde davranacak verilerin işlendiği kısımdır. 

*View: Verilerin görüntülendiği ve işlem yapmak için kullanıcı ile etkileşime geçilen kısımdır. 

*Presentation: Model ile View arasındaki bağlantıyı sağlar. Viewden gelen kullanıcı etkileşimlerine tepki verir.

Bu örnekte View kullanıcının butona tıkladığını Presenter’a haber verecek, Presenter yardımcı bir sınıfa sahip olup bu sınıftan istenilen 
formatta tarih bilgisini alacak. Presenter aldığı bu tarih bilgisini View’a iletecek ve View tarih bilgisini ekranda gösterecektir.

Örneğin şeması:

![Örnek Şeması](https://miro.medium.com/max/1262/1*EYBaHgPOKS7ZEUCa2jZYKw.png)
