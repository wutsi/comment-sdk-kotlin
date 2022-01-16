package com.wutsi.comment

import com.wutsi.comment.dto.GetCommentResponse
import com.wutsi.comment.dto.SearchCommentResponse
import feign.Headers
import feign.Param
import feign.RequestLine
import kotlin.Int
import kotlin.Long

public interface CommentApi {
  @RequestLine("GET /v1/comments?limit={limit}&offset={offset}")
  @Headers(value=["Content-Type: application/json"])
  public fun search(@Param("limit") limit: Int, @Param("offset") offset: Int): SearchCommentResponse

  @RequestLine("GET /v1/comments/{id}")
  @Headers(value=["Content-Type: application/json"])
  public fun `get`(@Param("id") id: Long): GetCommentResponse
}
