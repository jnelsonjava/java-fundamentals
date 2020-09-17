# Linter

The linter app offers a linter() method which takes a filepath to a Javascript file as an argument. It will return a string providing a list of all linting errors found.
  - currently finds only lines missing semicolons at their end
  - ignores empty lines
  - ignores any lines with "if" or "else"
  - ignores any lines ending with a curly brace
  - does not account for comments