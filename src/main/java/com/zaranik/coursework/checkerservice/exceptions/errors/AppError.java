package com.zaranik.coursework.checkerservice.exceptions.errors;

import java.time.LocalDateTime;

public record AppError(String description, LocalDateTime causedTime) {

  public static AppError justNow(String message) {
    return new AppError(message, LocalDateTime.now());
  }
}
