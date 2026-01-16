package firestorm.vuth.todolist.dto.response

data class PageResponse<T>(
    val data: List<T>,
    val page: Int,
    val limit: Int,
    val total: Int,
)
