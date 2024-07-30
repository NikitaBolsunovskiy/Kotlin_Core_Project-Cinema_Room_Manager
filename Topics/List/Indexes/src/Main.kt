fun solution(products: List<String>, product: String) {
    var result = ""
    products.filterIndexed { index, element ->
        if (element == product) result += "$index "
        product == element
    }
    println(result)
}