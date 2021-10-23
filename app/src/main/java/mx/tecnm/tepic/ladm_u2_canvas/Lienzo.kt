package mx.tecnm.tepic.ladm_u2_canvas

import android.graphics.*
import android.os.CountDownTimer
import android.view.View

class Lienzo(p:MainActivity): View(p) {
    val principal = p
    val bruja = BitmapFactory.decodeResource(principal.resources, R.drawable.bruja)
    val l1 = BitmapFactory.decodeResource(principal.resources, R.drawable.lapida1)
    val l2 = BitmapFactory.decodeResource(principal.resources, R.drawable.lapida2)
    val l3 = BitmapFactory.decodeResource(principal.resources, R.drawable.lapida3)
    val l4 = BitmapFactory.decodeResource(principal.resources, R.drawable.lapida4)
    val l5 = BitmapFactory.decodeResource(principal.resources, R.drawable.lapida5)
    val l6 = BitmapFactory.decodeResource(principal.resources, R.drawable.lapida6)
    val l7 = BitmapFactory.decodeResource(principal.resources, R.drawable.lapida7)
    val iglesia = BitmapFactory.decodeResource(principal.resources, R.drawable.iglesia)
    val parca = BitmapFactory.decodeResource(principal.resources, R.drawable.la_parca)

    val a1 = BitmapFactory.decodeResource(principal.resources, R.drawable.arbol1)
    val a2 = BitmapFactory.decodeResource(principal.resources, R.drawable.arbol2)
    val a3 = BitmapFactory.decodeResource(principal.resources, R.drawable.arbol4)


    var posX = 1500f;
    var posXParca = (0..2000).random().toFloat();
    var posYParca = 1000f;
    var lunaincremento = 0;
    var bandera = true

    val movimientos = object : CountDownTimer(2000,80){

        override fun onTick(p0: Long) {
            if(bandera == false){
                posYParca+=2

                if(posYParca>1020){
                    bandera=true
                    posXParca = (0..2000).random().toFloat()

                }

            }

            //Hacer que suba
            if(bandera == true){
                posYParca -=2
                if(posYParca<950){
                    bandera=false
                }
            }

            posX -=5
            lunaincremento++
            if(posX<-600){
                posX = 2200f
            }
            invalidate() //forzas a onDraw a repintar
        }

        override fun onFinish() {
            start()
        }

    }
    //constructor
    init {
        movimientos.start()

    }

    override fun onDraw(c: Canvas) {
        super.onDraw(c)
        val p = Paint()
        c.drawColor(Color.BLACK)
        //Luna
        p.color = Color.WHITE
        c.drawCircle(200f+lunaincremento, 150f, 90f, p)
        //Semi luna
        p.color = Color.BLACK
        c.drawCircle(250f+lunaincremento, 100f, 75f, p)

        //Montaña
        p.color = Color.GRAY
        c.drawCircle(600f, 1400f, 700f, p)
        //Contorno
        p.style = Paint.Style.STROKE
        p.strokeWidth = 10f
        p.color = Color.BLACK
        c.drawCircle(600f, 1400f, 800f, p)

        //Regresamos el estilo
        p.style = Paint.Style.FILL

        //Montaña2
        p.color = Color.GRAY
        c.drawCircle(1600f, 1400f, 800f, p)
        //Contorno
        p.style = Paint.Style.STROKE
        p.strokeWidth = 10f
        p.color = Color.DKGRAY
        c.drawCircle(1600f, 1400f, 800f, p)
        //regresamos estilos
        p.style = Paint.Style.FILL




        c.drawBitmap(l1,120f,890f,p)
        c.drawBitmap(l2,280f,710f,p)
        c.drawBitmap(l3,400f,800f,p)
        c.drawBitmap(l4,500f,650f,p)
        c.drawBitmap(l5,730f,760f,p)
        c.drawBitmap(l6,610f,830f,p)

        c.drawBitmap(a1,600f,620f,p)
        c.drawBitmap(a1,220f,820f,p)
        c.drawBitmap(a1,800f,840f,p)


        //Hacemos las nubes

        p.color = Color.LTGRAY
        c.drawCircle(200f, 200f, 30f, p)
        c.drawCircle(245f, 200f, 30f, p)
        c.drawCircle(290f, 200f, 30f, p)
        c.drawCircle(225.5f, 165f, 30f, p)
        c.drawCircle(255f, 165f, 30f, p)

        c.drawCircle(500f, 500f, 30f, p)
        c.drawCircle(545f, 500f, 30f, p)
        c.drawCircle(590f, 500f, 30f, p)
        c.drawCircle(525.5f, 465f, 30f, p)
        c.drawCircle(555f, 465f, 30f, p)

        c.drawCircle(800f, 350f, 30f, p)
        c.drawCircle(845f, 350f, 30f, p)
        c.drawCircle(890f, 350f, 30f, p)
        c.drawCircle(825.5f, 315f, 30f, p)
        c.drawCircle(855f, 315f, 30f, p)

        c.drawCircle(1400f, 50f, 30f, p)
        c.drawCircle(1445f, 50f, 30f, p)
        c.drawCircle(1490f, 50f, 30f, p)
        c.drawCircle(1425.5f, 5f, 30f, p)
        c.drawCircle(1455f, 5f, 30f, p)

        c.drawCircle(1000f, 450f, 30f, p)
        c.drawCircle(1045f, 450f, 30f, p)
        c.drawCircle(1090f, 450f, 30f, p)
        c.drawCircle(1025.5f, 405f, 30f, p)
        c.drawCircle(1055f, 405f, 30f, p)

        c.drawCircle(90f, 50f, 30f, p)
        c.drawCircle(135f, 50f, 30f, p)
        c.drawCircle(180f, 50f, 30f, p)
        c.drawCircle(120f, 15f, 30f, p)
        c.drawCircle(165f, 15f, 30f, p)

        //Hacemos el camino

        p.color = Color.rgb(196,164,132)
        c.drawCircle(1535f, 735f, 30f, p)
        c.drawCircle(1525f, 745f, 30f, p)
        c.drawCircle(1500f, 750f, 30f, p)
        c.drawCircle(1480f, 755f, 30f, p)
        c.drawCircle(1465f, 770f, 30f, p)
        c.drawCircle(1450f, 785f, 30f, p)
        c.drawCircle(1440f, 800f, 30f, p)
        c.drawCircle(1420f, 820f, 30f, p)
        c.drawCircle(1400f, 845f, 30f, p)
        c.drawCircle(1370f, 860f, 30f, p)
        c.drawCircle(1350f, 885f, 30f, p)
        c.drawCircle(1320f, 900f, 30f, p)
        c.drawCircle(1300f, 920f, 30f, p)
        c.drawCircle(1285f, 930f, 30f, p)
        c.drawCircle(1270f, 940f, 30f, p)
        c.drawCircle(1240f, 955f, 30f, p)
        c.drawCircle(1210f, 970f, 30f, p)
        c.drawCircle(1200f, 975f, 30f, p)
        c.drawCircle(1170f, 980f, 30f, p)
        c.drawCircle(1150f, 985f, 30f, p)
        c.drawCircle(1120f, 990f, 30f, p)
        c.drawCircle(1090f, 995f, 30f, p)
        c.drawCircle(1060f, 1000f, 30f, p)
        c.drawCircle(1040f, 1005f, 30f, p)
        c.drawCircle(1020f, 1015f, 30f, p)
        c.drawCircle(1000f, 1030f, 30f, p)
        c.drawCircle(980f, 1055f, 30f, p)

        //Ponemos más arboles

        c.drawBitmap(a1,1410f,700f,p)
        c.drawBitmap(a1,1200f,750f,p)
        c.drawBitmap(a1,1100f,710f,p)
        c.drawBitmap(a1,1300f,600f,p)
        c.drawBitmap(a1,1280f,840f,p)
        c.drawBitmap(a1,1000f,810f,p)




        c.drawBitmap(bruja,posX,150f,p)
        c.drawBitmap(iglesia,1400f,200f,p)
        c.drawBitmap(parca,posXParca,posYParca,p)
    }
}

