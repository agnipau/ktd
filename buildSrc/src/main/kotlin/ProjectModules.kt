import dev.whyoleg.kamp.project.*

//Autogenerated with kamp, don't change

object ProjectModules {
    val client = ProjectModule(":client")

    object Client {
        val raw = ProjectModule(":client-raw")
        val coroutines = ProjectModule(":client-coroutines")
    }
    val api = ProjectModule(":api")

    object Api {
        val stub = ProjectModule(":api-stub")
        val raw = ProjectModule(":api-raw")

        object Raw {
            val v1_5_0 = ProjectModule(":api-raw-v1.5.0")
            val v1_5_1 = ProjectModule(":api-raw-v1.5.1")
            val v1_5_2 = ProjectModule(":api-raw-v1.5.2")
            val v1_5_3 = ProjectModule(":api-raw-v1.5.3")
            val v1_5_4 = ProjectModule(":api-raw-v1.5.4")
        }
        val coroutines = ProjectModule(":api-coroutines")

        object Coroutines {
            val v1_5_0 = ProjectModule(":api-coroutines-v1.5.0")
            val v1_5_1 = ProjectModule(":api-coroutines-v1.5.1")
            val v1_5_2 = ProjectModule(":api-coroutines-v1.5.2")
            val v1_5_3 = ProjectModule(":api-coroutines-v1.5.3")
            val v1_5_4 = ProjectModule(":api-coroutines-v1.5.4")
        }
        val lib = ProjectModule(":api-lib")

        object Lib {
            val v1_5_0 = ProjectModule(":api-lib-v1.5.0")
            val v1_5_1 = ProjectModule(":api-lib-v1.5.1")
            val v1_5_2 = ProjectModule(":api-lib-v1.5.2")
            val v1_5_3 = ProjectModule(":api-lib-v1.5.3")
            val v1_5_4 = ProjectModule(":api-lib-v1.5.4")
        }
    }
    val cli = ProjectModule(":cli")
    val examples = ProjectModule(":examples")
}
