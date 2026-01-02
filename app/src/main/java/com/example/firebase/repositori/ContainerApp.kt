package com.example.firebase.repositori

interface ContainerApp {
    val repositorySiswa: RepositorySiswa
}

class DefaultContainerApp: ContainerApp{
    override val repositorySiswa: RepositorySiswa by lazy {
        FirebaseRepositorySiswa()
    }
}