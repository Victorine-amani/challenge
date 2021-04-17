fun main(){
    var inchi=Country("Kenya",52.57,"Uhuru Kenyatta","chocolate skin",67)
    inchi.instance()
    inchi.pop(12)
    inchi.press()
    inchi.heritage()
}

//Classes and objects
class Country(var name:String,var populie:Double,var preso:String,var color:String,var lifeSpan:Int ){
    fun instance(){
        println("The country of $name is over populated with a current population of $populie million")
    }
    fun pop(minAge:Int){
        if(minAge<lifeSpan){
            println("Great for the country")
        }else{
            println("How sad")
        }
    }
    fun press(){
        when(preso){
            "Jomo Kenyatta"->println("Dead but not forgoten")
            "Daniel arap Moi"->println("Dead and would like to be forgotten")
            "Stanely Mwai Kibaki"->println("Very insulting")
            "Uhuru Kenyatta"->println("Is currently the president of $name")
            else->println("I don't know their history")

        }
    }
    fun heritage(){
        println("$name has rich hair and $color")
    }
}
