<#import "structure/template.ftlh" as t>
<@t.template>

    <div class="container">
        <div class="calculator">
        <div class="row">
            <div class="col">
                <label for="customRange2" class="form-label">Требуемая сумма</label>
            </div>
            <div class="col">
                <input class="form-control" type = "text" name = "need_amount" id="need_amount"/><br/>
            </div>
        </div>

        <input type="range" class="form-range" min="0" max="30000" id="customRange2">

        <div class="row">
            <div class="col">
                <label for="customRange3" class="form-label">Срок</label>
            </div>
            <div class="col">
                <input class="form-control" type = "text" name = "period_credit" id="period_credit"/><br/>
            </div>
        </div>
        <input type="range" class="form-range" min="0" max="30" id="customRange3">

        <label for="customRange3" class="form-label">Процент сервиса, % руб.</label>
        <input class="form-control" type = "text" name = "percent_credit" id="percent_credit"/><br/>
        </div>

        <button><a class="lead" href="/order">Получить займ</a></button>

    </div>

    <script>
        let inputElement2 = document.getElementById("customRange2");
        let inputValue2 = inputElement2.value;
        let inputElement3 = document.getElementById("customRange3");
        let inputValue3 = inputElement3.value;
        let inputNeedAmount = document.getElementById("need_amount");
        let inputPeriodCredit = document.getElementById("period_credit");
        let inputPercentCredit = document.getElementById("percent_credit");

        inputNeedAmount.value = 0;
        inputPeriodCredit.value = 0;

        inputNeedAmount.addEventListener('input', () => {
            if (inputNeedAmount.value <= 5000){
                inputPeriodCredit.value = 7;
            }
            if (5000 < inputNeedAmount.value){
                inputPeriodCredit.value = 14;
            }
            if (20000 < inputNeedAmount.value){
                inputPeriodCredit.value = 30;
            }
        })

        inputElement2.addEventListener('input', () => {
            inputNeedAmount.value = inputElement2.value;
            if (inputElement2.value <= 5000){
                inputPeriodCredit.value = 7;
            }
            if (5000 < inputElement2.value){
                inputPeriodCredit.value = 14;
            }
            if (20000 < inputElement2.value){
                inputPeriodCredit.value = 30;
            }
            inputPercentCredit.value = parseInt(inputNeedAmount.value) + parseInt(inputNeedAmount.value) * 0.1;
            if (inputElement3.value > 14 || inputPeriodCredit.value > 14){
                inputPercentCredit.value = parseInt(inputNeedAmount.value) + parseInt(inputNeedAmount.value) * 0.2;
            }
            inputElement3.value = inputPeriodCredit.value;
        })




        inputElement3.addEventListener('input', () => {
            inputPeriodCredit.value = inputElement3.value;
        })

        inputPeriodCredit.addEventListener('input', () => {
            inputElement3.value = inputPeriodCredit.value;
        })

        inputNeedAmount.addEventListener('input', () => {
            inputElement2.value = inputNeedAmount.value;
            inputPercentCredit.value = parseInt(inputNeedAmount.value) + parseInt(inputNeedAmount.value) * 0.1;
            if (inputElement3.value > 14 || inputPeriodCredit.value > 14){
                inputPercentCredit.value = parseInt(inputNeedAmount.value) + parseInt(inputNeedAmount.value) * 0.2;
            }
        })
    </script>

</@t.template>