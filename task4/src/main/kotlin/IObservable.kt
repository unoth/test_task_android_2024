interface IObservable {
    val subscribers: MutableList<IObserver>

    fun addSubscriber(subscriber: IObserver) {
        subscribers.add(subscriber)
    }

    fun removeSubscriber(subscriber: IObserver) {
        subscribers.remove(subscriber)
    }

    fun notification() {
        subscribers.forEach {
            it.update()
        }
    }
}