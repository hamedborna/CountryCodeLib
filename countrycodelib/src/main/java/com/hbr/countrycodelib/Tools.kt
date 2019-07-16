package com.hbr.countrycodelib

import android.content.Context

class Tools {

    object INSTANCE{

        fun retriveResourceID(context: Context, country_code: String): Int {

            val resource = context.resources
            return resource.getIdentifier(country_code, "drawable", context.packageName)
        }
    }
}