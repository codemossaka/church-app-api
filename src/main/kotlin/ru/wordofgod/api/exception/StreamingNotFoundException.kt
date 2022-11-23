package ru.wordofgod.api.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(HttpStatus.NOT_FOUND)
class StreamingNotFoundException(message: String):RuntimeException(message)