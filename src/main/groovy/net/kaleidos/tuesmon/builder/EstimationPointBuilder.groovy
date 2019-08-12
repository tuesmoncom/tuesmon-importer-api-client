package net.kaleidos.tuesmon.builder

import net.kaleidos.domain.EstimationPoint
import net.kaleidos.domain.Project
import net.kaleidos.tuesmon.common.SafeJson

class EstimationPointBuilder implements TuesmonEntityBuilder<EstimationPoint>, SafeJson {

    EstimationPoint build(Map json, Project project) {
        def estimationPoint = new EstimationPoint()

        estimationPoint.with {
            name = json.name
            value = nullSafe(json.value)
        }

        estimationPoint
    }
}