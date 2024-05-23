class NewsPoster : IObservable {
    override val subscribers: MutableList<IObserver> = mutableListOf()
    var breakingNews = "https://www.breakingNews.com/"
        set(value) {
            field = value
            notification()
        }
}