package institute.ribbon.mari.insider.librarybymari

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform