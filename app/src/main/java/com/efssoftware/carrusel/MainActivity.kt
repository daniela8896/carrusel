package com.efssoftware.carrusel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.imaginativeworld.whynotimagecarousel.CarouselItem
import org.imaginativeworld.whynotimagecarousel.ImageCarousel

class MainActivity : AppCompatActivity() {

    val list = mutableListOf<CarouselItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carousel: ImageCarousel = findViewById(R.id.carousel)

        list.add(CarouselItem("https://http2.mlstatic.com/D_NQ_NP_705205-MCO42865427972_072020-O.jpg"))
        list.add(CarouselItem("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQiBBh1xgz7MiVk2KcEDSpCBy8pMK1EryiapA&usqp=CAU"))
        list.add(CarouselItem("https://lh3.googleusercontent.com/proxy/QD3_prRX9y53dGj9tslgStkMM1bW42y2iCYcBCkRpK1Qqbd9nwlOCLhxRVGyMSwoVNcqfZDbqGozIFoS0xsQQmzYYHLogWUdiG320ej0dDWp0qxhgoUBLVTCJTSwFS-7KBb4c_OUOZib8fZkcIQNLeTGAMiN-YaR"))
        carousel.addData(list)


    }
}