package password_checker

object Password {
  def isValid(password : String) =
    def digitCount(str : String) =
      var count = 0
      for ch <- str do
        if ch.isDigit then count += 1
      count
    password.length >= 6 && digitCount(password) >= 3
}
