<%-- 
    Document   : admin-form
    Created on : Mar 17, 2023, 7:33:17 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<body>
    <style>
        .statistical .icon {

            color: white;
            align-self: center;
            padding: 30px 20px;
            font-size: xx-large;
            border-radius: 10% 0 0 10%;
        }

        .statistical .detail {
            background-color: rgba(128, 128, 128, 0.116);
            border-radius: 0 10% 10% 0;
            width: 150px;
            font-size: smaller;
            text-align: center;
        }

        .statistical .detail :first-child {
            font-size: 40px;
            width: 100%;

            padding-top: 5%;
        }

        .statistical .money .detail {
            width: 250px !important;
        }



        /* chart */
        .pc-chart-wrapper {
            box-sizing: border-box;
            font-family: inherit;
        }
        .pc-tooltip {
            position: absolute;
            pointer-events: none;
            background: #121212;
            color: #ffffff;
            font-size: 13px;
            padding: 5px 15px;
            border-radius: 3px;
            line-height: 1;
            font-family: inherit;
            z-index: 2;
        }
        text {
            pointer-events: none;
        }
        .pc-expand {
            transform: scale(1.5, 1.5);
        }
        .pc-legend-text {
            text-transform: capitalize;
        }
        .pc-y-axis path,
        .pc-x-axis path {
            stroke: #e5e5e5;
        }

        .pc-y-axis line,
        .pc-x-axis line {
            display: none;
        }

        .pc-y-axis text,
        .pc-x-axis text {
            color: #001737;
        }
    </style>
    <div class="container-fluid pt-5 ">
        <div class="container">
            <div class="border-start border-5 border-primary ps-5 mb-5" style="max-width: 600px;">
                <h6 class="text-primary text-uppercase">Welcome admin</h6>
                <h1 class="display-5 text-uppercase mb-0">Admin management page</h1>
            </div>
            <div class="col-md-12 statistical d-flex justify-content-around mb-5">
                <div class="d-flex register m-1">
                    <div style="background-color: orange;" class="icon"><i class="fa-solid fa-person-circle-check"></i>
                    </div>
                    <div class="detail">
                        <div>120</div>
                        <div>account registrant</div>
                    </div>
                </div>
                <div class="d-flex user m-1">
                    <div style="background-color: rgba(0, 0, 255, 0.726);" class="icon"><i
                            class=" fa-solid fa-user"></i></div>
                    <div class="detail">
                        <div>120</div>
                        <div>customer has at least 1 order</div>
                    </div>
                </div>
                <div class="d-flex pet-sold m-1">
                    <div style="background-color: #7AB730;" class="icon"><i class="fa-solid fa-paw"></i></div>
                    <div class="detail">
                        <div>120</div>
                        <div>total pet sold</div>
                    </div>
                </div>
                <div class="d-flex service m-1">
                    <div style="background-color: rgb(255, 108, 133);" class="icon"><i
                            class="fa-solid fa-hand-holding-heart"></i></div>
                    <div class="detail">
                        <div>120</div>
                        <div>total service used</div>
                    </div>
                </div>
                <div class="d-flex money m-1">
                    <div style="background-color: rgb(204, 0, 204);" class="icon"><i class=" fa-solid fa-coins"></i>
                    </div>
                    <div class="detail">
                        <div>120.000.000</div>
                        <div>revenue</div>
                    </div>
                </div>
            </div>
            <div class="d-flex">
                <div class="col-md-6" id="column-chart"></div>
                <div class="col-md-6" id="spline-chart"></div>
            </div>
            <div class="mt-5">
                <div id="donut-chart"></div>
            </div>
        </div>
    </div>

    <!-- Thêm Pet -->
    <button type="button" class="btn btn-primary m-5" data-bs-toggle="modal" data-bs-target="#exampleModal"
            data-bs-whatever="@mdo">Thêm Food</button>
    <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">New message</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <form>
                        <div class="mb-3">
                            <label for="fid" class="col-form-label">Food ID:</label>
                            <input type="text" class="form-control" id="fid">
                        </div>
                        <div class="mb-3">
                            <label for="fname" class="col-form-label">Food Name:</label>
                            <input type="text" class="form-control" id="fname">
                        </div>
                        <div class="mb-3">
                            <label for="ftype" class="col-form-label">Food Type:</label>
                            <input type="text" class="form-control" id="ftype">
                        </div>
                        <div class="mb-3">
                            <label for="fprice" class="col-form-label">Food Price:</label>
                            <input type="text" class="form-control" id="fprice">
                        </div>
                        <div class="mb-3">
                            <label for="famount" class="col-form-label">Food Amount:</label>
                            <input type="text" class="form-control" id="famount">
                        </div>
                        <div class="mb-3">
                            <label for="fpic" class="col-form-label">Food Picture:</label>
                            <input type="file" class="form-control" id="fpic">
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary">Send message</button>
                </div>
            </div>
        </div>
    </div>


    <!-- Thêm Food -->
    <button type="button" class="btn btn-primary m-5" data-bs-toggle="modal" data-bs-target="#addPet"
            data-bs-whatever="@mdo">Thêm Pet</button>
    <div class="modal fade" id="addPet" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">New message</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <form>
                        <div class="mb-3">
                            <label for="id" class="col-form-label">Pet ID:</label>
                            <input type="text" class="form-control" id="id">
                        </div>
                        <div class="mb-3">
                            <label for="name" class="col-form-label">Pet Name:</label>
                            <input type="text" class="form-control" id="name">
                        </div>
                        <div class="mb-3">
                            <label for="color" class="col-form-label">Pet Color:</label>
                            <input type="text" class="form-control" id="color">
                        </div>
                        <div class="mb-3">
                            <label for="type" class="col-form-label">Pet Type:</label>
                            <input type="text" class="form-control" id="type">
                        </div>
                        <div class="mb-3">
                            <label for="price" class="col-form-label">Pet Price:</label>
                            <input type="text" class="form-control" id="price">
                        </div>
                        <div class="mb-3">
                            <label for="amount" class="col-form-label">Pet Amount:</label>
                            <input type="text" class="form-control" id="amount">
                        </div>
                        <div class="mb-3">
                            <label for="pic" class="col-form-label">Pet Picture:</label>
                            <input type="file" class="form-control" id="pic">
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary">Send message</button>
                </div>
            </div>
        </div>
    </div>


    <!-- ------List Food----- -->


    <button type="button" class="btn btn-primary m-5" data-bs-toggle="modal" data-bs-target="#listFood">
        List Food
    </button>

    <div class="modal fade" id="listFood" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog modal-xl">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">

                    <table class="table" style="width: 100%;">
                        <thead>
                        <td>FoodID</td>
                        <td>FoodName</td>
                        <td>FoodType</td>
                        <td>FoodPrice</td>
                        <td>FoodAmount</td>
                        </thead>
                        <tbody>
                            <tr>
                                <td>F0001</td>
                                <td>Thức ăn chay cho chó Natural Core eco10 gói 1kg</td>
                                <td>dogFood</td>
                                <td>200000</td>
                                <td>45</td>
                                <td><img class="w-25" src="img/product-1.png" alt=""></td>
                                <td><a class="btn btn-danger" href="">Delete</a></td>
                            </tr>
                        </tbody>
                    </table>

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                </div>
            </div>
        </div>
    </div>


    <!-- ------List Pet------- -->

    <button type="button" class="btn btn-primary m-5" data-bs-toggle="modal" data-bs-target="#listPet">
        List Pet
    </button>

    <div class="modal fade" id="listPet" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog modal-xl">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">

                    <table class="table" style="width: 100%;">
                        <thead class="thead-dark w-100">
                        <td>PetID</td>
                        <td>PetName</td>
                        <td>PetColor</td>
                        <td>FoodType</td>
                        <td>FoodPrice</td>
                        <td>FoodAmount</td>
                        </thead>
                        <tbody class="w-100">
                            <tr>
                                <td>P0001</td>
                                <td>Alaska</td>
                                <td>Vàng Đen</td>
                                <td>dog</td>
                                <td>15000000</td>
                                <td>22</td>
                                <td><img class="w-25" src="img/blog-2.jpg" alt=""></td>
                                <td><a class="btn btn-danger m-0" href="">Delete</a></td>
                            </tr>
                        </tbody>
                    </table>

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                </div>
            </div>
        </div>
    </div>



    <!-- JavaScript Libraries -->
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
    <script src="lib/easing/easing.min.js"></script>
    <script src="lib/waypoints/waypoints.min.js"></script>
    <script src="lib/owlcarousel/owl.carousel.min.js"></script>

    <!-- Template Javascript -->
    <script src="js/main.js"></script>
    <script>
        pluscharts.draw({
            drawOn: '#column-chart',
            type: "column",
            dataset: {
                data: [
                    {
                        label: "Jan",
                        value: 40
                    },
                    {
                        label: "Feb",
                        value: 50
                    },
                    {
                        label: "Mar",
                        value: 60
                    },
                    {
                        label: "Apr",
                        value: 70
                    },
                    {
                        label: "May",
                        value: 80
                    }
                ],
                backgroundColor: "#5d62b4", //can be array or single color
                borderColor: "#5d62b4",
                borderWidth: 0,
                legendLabel: "Registers"
            },
            options: {
                barPadding: .65,
                barWidth: 15,
                text: {
                    display: false,
                    color: "#6c478c"
                },
                axes: {
                    x: {
                        display: true,
                        min: 0,
                        max: 100
                    },
                    y: {
                        display: true,
                        min: 0,
                        max: 100
                    }
                },
                legends: {
                    display: true,
                    width: 20,
                    height: 20
                },
                size: {
                    width: '400', //give 'container' if you want width and height of initiated container
                    height: '400'
                }
            }
        });


        pluscharts.draw({
            drawOn: "#spline-chart",
            type: "spline",
            dataset: {
                data: [
                    {
                        label: 10,
                        value: 20
                    },
                    {
                        label: 20,
                        value: 50
                    },
                    {
                        label: 30,
                        value: 30
                    },
                    {
                        label: 40,
                        value: 10
                    },
                    {
                        label: 50,
                        value: 100
                    },
                    {
                        label: 60,
                        value: 60
                    },
                    {
                        label: 70,
                        value: 80
                    },
                    {
                        label: 80,
                        value: 50
                    },
                    {
                        label: 100,
                        value: 70
                    }
                ],
                lineColor: "#ef5958",
                lineWidth: 2,
                legendLabel: "visitors"
            },
            options: {
                text: {
                    display: false,
                    color: "#6c478c"
                },
                points: {
                    display: true,
                    radius: 3
                },
                axes: {
                    x: {
                        display: true,
                        scale: 3,
                        min: 0,
                        max: 100
                    },
                    y: {
                        display: true,
                        scale: 3,
                        min: 0,
                        max: 100
                    }
                },
                legends: {
                    display: true,
                    width: 20,
                    height: 20
                },
                size: {
                    width: '400', //give 'container' if you want width and height of initiated container
                    height: '400'
                }
            }
        })
        pluscharts.draw({
            drawOn: "#donut-chart",
            type: "donut",
            dataset: {
                data: [
                    {
                        label: "IE",
                        value: 70
                    },
                    {
                        label: "Chrome",
                        value: 50
                    },
                    {
                        label: "Firefox",
                        value: 30
                    },
                    {
                        label: "Safari",
                        value: 20
                    }
                ],
                backgroundColor: ["#fff09d", "#5d62b4", "#f9b5c2", "#04d59f"],
                borderColor: "#ffffff",
                borderWidth: 0,
            },
            options: {
                width: 60,
                text: {
                    display: false,
                    color: "#f6f6f6"
                },
                legends: {
                    display: true,
                    width: 20,
                    height: 20
                },
                size: {
                    width: '400', //give 'container' if you want width and height of initiated container
                    height: '400'
                }
            }
        })
    </script>
</body>