package thoughtbot.expandableadapter

import awais.instagrabber.repositories.responses.User

class ExpandableGroup(val title: String, val items: List<User>?) {

    val itemCount: Int
        get() = items?.size ?: 0
}