package org.bearleft.bit.instructions.branch
import org.bearleft.bit.BitCPU
/**
 * User: Eric Siebeneich
 * Date: 3/29/14
 */
class BgtInstruction extends BranchInstruction {

	BgtInstruction() {
		super(1)
	}

	@Override
	void onExecute(BitCPU cpu, int s, int t, int u) {
		branch(cpu.registers[s] > cpu.registers[t], cpu, u)
	}
}
