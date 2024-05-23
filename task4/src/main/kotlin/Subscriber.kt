class Subscriber(private var newsPoster: NewsPoster) : IObserver {
    override fun update() {
        println("New post! Link: ${newsPoster.breakingNews}")
    }
}