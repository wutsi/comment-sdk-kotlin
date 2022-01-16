package com.wutsi.comment.dto

import kotlin.collections.List

public data class SearchCommentResponse(
  public val comments: List<Comment> = emptyList()
)
