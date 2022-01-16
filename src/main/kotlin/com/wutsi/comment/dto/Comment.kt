package com.wutsi.comment.dto

import kotlin.Long
import kotlin.String

public data class Comment(
  public val id: Long = 0,
  public val storyId: Long = 0,
  public val userId: Long = 0,
  public val text: String = "",
  public val creationDateTime: Long = 0,
  public val modificationDateTime: Long = 0
)
