

class PersonConfigBuilder() {
    var type: String = "Человек"
    var height: Int = 175
    var weight: Int = 65
    var age: Int = 18


    fun setType(value: String): PersonConfigBuilder{
        this.type = value
        return this
    }

    fun setHeight(value: Int): PersonConfigBuilder{
        this.height = value
        return this
    }

    fun setWeight(value: Int):  PersonConfigBuilder{
        this.weight = value
        return this
    }

    fun setAge(value: Int): PersonConfigBuilder{
        this.age = value
        return this
    }

    fun build(): PersonConfig{
        return PersonConfig(
            type = type,
            height = height,
            weight = weight,
            age = age
        )
    }
}