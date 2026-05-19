let products = [

    {
        id: 1,
        name: "Laptop",
        stock: 10,
        maxStock: 10,
        supplier: "Dell Supplier"
    },

    {
        id: 2,
        name: "Mouse",
        stock: 50,
        maxStock: 50,
        supplier: "HP Supplier"
    },

    {
        id: 3,
        name: "Keyboard",
        stock: 30,
        maxStock: 30,
        supplier: "Logitech Supplier"
    }
];

function showProducts() {

    let container = document.getElementById("productContainer");

    container.innerHTML = "<h2>Products</h2>";

    products.forEach((product, index) => {

        let stockStatus = "";

        if(product.stock <= 5){
            stockStatus = "<p style='color:red;'>Low Stock</p>";
        }

        container.innerHTML += `

        <div class="product-card">

            <h3>${product.name}</h3>

            <p>
            Stock:
            <span id="stock-${index}">
            ${product.stock}
            </span>
            </p>

            <p>Supplier: ${product.supplier}</p>

            ${stockStatus}

            <button onclick="placeOrder(${index})">
            Customer Order
            </button>

        </div>
        `;
    });
}

function placeOrder(index) {

    if (products[index].stock > 0) {

        products[index].stock--;

        showProducts();

        alert("Customer order placed successfully!");

    } else {

        alert("Product Out Of Stock!");
    }
}

function refillStock(index) {

    products[index].stock = products[index].maxStock;

    showSuppliers();

    alert(
        "Supplier order placed successfully!\nStock refilled to maximum quantity."
    );
}

function showSuppliers() {

    let container = document.getElementById("productContainer");

    container.innerHTML = `<h2>Suppliers</h2>`;

    products.forEach((product, index) => {

        container.innerHTML += `

        <div class="product-card">

            <h3>${product.supplier}</h3>

            <p>Supplies: ${product.name}</p>

            <p>
            Current Stock:
            ${product.stock}
            </p>

            <button onclick="refillStock(${index})">
            Order Stock
            </button>

        </div>
        `;
    });
}

function showOrders() {

    let container = document.getElementById("productContainer");

    container.innerHTML = `

    <h2>Orders Module</h2>

    <div class="product-card">
        Customer orders reduce product stock.
    </div>

    <div class="product-card">
        Admin can refill stock from suppliers section.
    </div>
    `;
}

showProducts();