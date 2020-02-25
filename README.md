# Test a String for '(),[],{}' well-formedness

## Goal
A string over the characters `()[]{}` is said to be well-formed, if the different types of brackets match __in the correct order__.

Write a program that outputs `true` or `false` depending on the well-formedness of the input.

### Example

| Input    | Output |
|----------|--------|
| ([{}])() | true   |
| ([)]     | false  |

### Constraints
Input strings consist only of characters `()[]{}`
