package com.academy.hellokotlin

import com.google.gson.annotations.SerializedName


data class MyModelKotlin(@SerializedName("fields") var mutableMap: MutableMap<String,FormItem>)
{

}

data class FormItem(var key: String, var displayName: String, var mandatory: Boolean,
                    var type: String, var values: MutableList<Values>, var defaultValue: String, var validation: String,
                    var note: String, var error: String, var noteStyle: Any, var addMore: Boolean,
                    var placeholder: String, var minLength: Int, var maxLength: Int, var disabled: Boolean,
                    var url: String, var dependents: MutableMap<String, MutableList<String>>, var toolTipUrl: String, var minDateLimit: Int,
                    var maxDateLimit: Int, var replicatePaxWise: String)


data class Values(var key: String, var value: String, var parent: String)
