package by.tms.lesson25.homework.service;

import by.tms.lesson25.homework.model.Operation;

public class OperationService {
    public Operation calculate(Operation operation) {
        switch (operation.getType()){
            case "sum":
                operation.setResult(operation.getNum1() + operation.getNum2());
                return operation;
            case "sub":
                operation.setResult(operation.getNum1() - operation.getNum2());
                return operation;
            case "mult":
                operation.setResult(operation.getNum1() * operation.getNum2());
                return operation;
            case "div":
                operation.setResult(operation.getNum1() / operation.getNum2());
                return operation;
        }
        throw new RuntimeException();
    }
}
