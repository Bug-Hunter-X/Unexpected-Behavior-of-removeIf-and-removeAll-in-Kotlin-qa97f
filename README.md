This repository demonstrates a subtle issue with Kotlin's `removeIf` and `removeAll` functions.  While seemingly straightforward, these functions can exhibit unexpected behavior, particularly when dealing with large lists or predicates involving complex computations.  The issue stems from potential performance implications and the subtle differences in their behavior.

The `bug.kt` file illustrates the problem. The provided solution offers a more robust approach.
