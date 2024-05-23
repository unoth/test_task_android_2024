fun main() {
    val newsPoster = NewsPoster()
    with(newsPoster) {
        addSubscriber(Subscriber(newsPoster))
        addSubscriber(Subscriber(newsPoster))
        removeSubscriber(Subscriber(newsPoster))
        addSubscriber(Subscriber(newsPoster))
    }
    newsPoster.notification()
}