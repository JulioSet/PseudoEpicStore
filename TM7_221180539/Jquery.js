$("input[type=radio]").checkboxradio()
$("#kotakKiri").ready(function () {
    const warna = ["lightblue", "lightcoral", "lightcyan", "lightgoldenrodyellow", "lightgray", "lightgreen", "lightgrey", "lightpink", "lightsalmon", "lightseagreen", "lightskyblue", "lightsteelblue"]
    var ctr = 0
    
    $("#tambahCat").click(function () {
        let isi = $("#catatan").val()
        let rand_warna = warna[Math.floor(Math.random() * 12)]
        let temp = `<div class="memo" style="background-color: ${rand_warna}" idx="${ctr}"><p>${isi}</p></div>`
        $("#kotakKiri").append(temp)
        
        let memos = $(".memo")
        for (let i = 0; i < ctr+1; i++) {
            let drag = memos[i]
            if ($(drag).attr("idx") == ctr) {
                $(drag).draggable()
                ctr++
            }
        }
    })
})

$("#data").sortable()
$("#kotakKanan").ready(function () {
    let usna = ""
    let na = ""
    let kel = ""

    $("#register").click(function () {
        usna = $("#txtUsername").val()
        na = $("#txtNama").val()
        kel1 = $("input[id='radio-1']:checked").val()
        kel2 = $("input[id='radio-2']:checked").val()

        if (usna == "" || na == "" || kel1 == undefined && kel2 == undefined) {
            alert("Semua field harus diisi")
        } else {
            // kelamin
            if (kel1 == "on") {
                kel = "Pria"
            } else if (kel2 == "on") {
                kel = "Wanita"
            }

            // masuk ke daftar
            let regis = `
                <table class="listPegBody">
                    <tr>
                        <td class="username">${usna}</td>
                        <td class="nama">${na}</td>
                        <td class="kelamin">${kel}</td>
                    </tr>
                </table>
            `
            $("#data").append($(regis))

            // pesan sukses
            alert("Sukses Register")
        }
    })
})