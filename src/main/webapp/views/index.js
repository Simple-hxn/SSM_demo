$(document).ready(function() {
    $("button").click(function () {
        $.ajax({
            url: "index.do",
            success: function (result) {
                console.log(result)
                $("#div1").html(result.toString());
            }
        });
    });
});