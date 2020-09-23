# LineAPIWithSpringBoot

Remind myself

อันดับเเรกเราต้องมี Provider เเบะ Channel ใน line developer ก่อน

ต่อมาเราต้องสร้าง Channel access token(provider>channel>Messaging API) เเละ เซ็ต Webhook URL

เสริมวิธี Webhook URL ในที่นี้เราต้องใช้เป็น https เเต่ในเคสนี้ผมใช้เป็น localhost เเล้วใช้ ngrok เอา(ngrok มันจะเอา localhost server ที่รันอยู่นะตอนนั้นเปลี่ยนเป็น https เเละ อนุญาติให้คนอื่นเข้าถึงได้) โดยวิธีติดตั้งเเละเเละ start sever อยู่ตาม link:https://www.youtube.com/watch?v=Cin8DM-xsUI

ในขั้นตอนการใส่ Webhook URL ก็ใส่ตาม vdo เเต่ เปลี่ยน pathเป็น /Webhook เนื่องจากในโค้ดเราเซ็ตไว้

เเละนี่คือตัวอย่างเมื่อเราทํา action กับตัว line official ของเรา 

จะสังเกตุว่าตัว webhook object ที่ไลน์ส่งมามันส่งมาเป็น string ซึ่งเราต้องเปลี่ยนเป็น JSON ก่อนเพื่อที่จะเอาไปใช้สดวกขึ้น
